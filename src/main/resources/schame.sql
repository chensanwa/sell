-- 产品类目表
create table `product_category`(
  `category_id` int not null auto_increment,
  `category_name` varchar(64) not null comment '类目名称',
  `category_type` int not null comment '类目编号',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key (`category_id`),
  unique key `uqe_category_type` (`category_type`)
) engine=InnoDB default charset=utf8mb4 comment='类目表';

-- 产品信息表
create table `product_info`(
  `product_id` varchar(32) not null ,
  `product_name` varchar(64) not null comment '商品名称',
  `product_price` decimal(8,2) not null comment '单价',
  `product_stock` int not null comment '库存',
  `product_description` varchar(64) default null comment '描述',
  `product_icon` varchar(512) default null comment '小图',
  `product_status` tinyint(3) default '0' comment '商品状态，0正常 1下架',
  `category_type` int not null comment '类目编号',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key (`product_id`)
) engine=InnoDB default charset=utf8mb4;

-- 商品主表
create table `order_master`(
  `order_id` varchar(32) not null ,
  `buyer_name` varchar(32) not null comment '买家名字',
  `buyer_phone` varchar(32) not  null comment '买家电话',
  `buyer_address` varchar(128) not null comment '买家地址',
  `buyer_openid` varchar(64) not null comment '买家微信openid',
  `order_amount` decimal(8,2) not null comment '订单总金额',
  `order_status` tinyint(3) not null default '0' comment '订单状态，默认为新订单',
  `pay_status` tinyint(3) not null default '0' comment '支付状态，默认未支付',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key (`order_id`),
  key `idx_buyer_openid`(`buyer_openid`)
)engine=InnoDB default charset=utf8mb4;

-- 订单详情表
create table `order_detail`(
  `detail_id` varchar(32) not null ,
  `order_id` varchar(32) not null ,
  `product_id` varchar(32) not null ,
  `product_name` varchar(64) not null comment '商品名称',
  `product_price` decimal(8,2) not null comment '当前价格，单位：分',
  `product_quantity` int not null comment '数量',
  `product_icon` varchar(512) comment '小图',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key (`detail_id`),
  key `idx_order_id`(`order_id`),
  constraint `order_detail_idfk_1` foreign key (`order_id`) references `order_master`(`order_id`)
)engine=InnoDB default charset=utf8mb4;