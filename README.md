# 智慧自助餐饮系统数据库设计

# 小程序端：

## （1）登录注册页面模块

### 表1 小程序端（用户）信息表（Comsumer）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否可以为空 | 外键（参照完整性） |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| C\_id | int | 用户编号 | 是 | 20 | 否 | - |
| C\_name | varchar | 用户名 | 否 | 20 | 否 | - |
| C\_sex | varchar | 性别 | 否 | 10 | 否 | - |
| C\_phone | int | 用户电话号 | 否 | 20 | 否 | - |
| C\_password | int | 用户密码 | 否 | 20 | 否 | - |
| C\_time | date | 用户注册时间 | 否 | 20 | 否 | - |

## （2）首页和搜索页模块

### 表2 用户搜索历史记录信息表（History）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否为空 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| C\_id | int | 用户编号 | 是 | 20 | 否 | foreign key（Comsumer:C\_id） |
| H\_history | list | 搜索历史记录 | 否 | - | 否 | - |

### 表3 餐厅信息表（Restaurant）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否为空 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| res\_id | int | 餐厅编号 | 是 | 10 | 否 | - |
| res\_name | varchar | 餐厅名称 | 否 | 20 | 否 | - |
| res\_address | varchar | 餐厅地址 | 否 | 40 | 否 | - |
| res\_opentime | varchar | 餐厅营业时间段 | 否 | 20 | 否 | - |
| res\_num | int | 本日就餐人数 | 否 | 10 | 否 | - |

### 表4 菜品信息表（Menu）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否为空 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| M\_id | int | 菜品唯一id号 | 是 | 20 | 否 | - |
| M\_name | varchar | 菜品名 | 否 | 30 | 否 | - |
| M\_material | text | 菜品原料 | 否 | 50 | 否 | - |
| M\_oldprice | doubel | 菜品成本 | 否 | 10 | 否 | - |
| M\_price | double | 菜品单价 | 否 | 10 | 否 | - |
| M\_calorie | double | 卡路里 | 否 | 10 | 否 | - |
| M\_category | varchar | 菜品类型 | 否 | 20 | 否 | - |

## （3）个人中心模块

### 表5用户评价表（evaluate）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否为空 | 外键（参照完整性） |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| C\_id | int | 用户编号 | 否 | 20 | 否 | foreign key（Comsumer:C\_id） |
| O\_id | string | 订单编号 | 否 | 10 | 否 | foreign key（Order:O\_id） |
| M\_id | int | 菜品编号 | 否 | 10 | 否 | foreign key（Menu:M\_id） |
| E\_opinion | text | 用户评价信息 | 否 | - | 是 | - |
| E\_time | date | 评价时间 | 否 | - | 否 | - |
| E\_score | int | 每道菜用户评价打分 | 否 | 10 | 否 | - |

### 表5用户投诉信息表（Feedback）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否能为空 | 外键（参照完整性） |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| C\_id | int | 用户编号 | 否 | 20 | 否 | foreign key（Comsumer:C\_id） |
| F\_time | date | 用户投诉时间 | 否 | - | 否 | - |
| F\_complaint | text | 用户投诉信息 | 否 | - | 否 | - |
| F\_status | int | 投诉状态（取值为0或1） | 否 | - | 否 | - |
| FM\_opinion | text | 管理员反馈信息 | 否 | - | 是 | - |
| FM\_time | date | 管理员反馈时间 | 否 | - | 是 | - |

### 表6订单信息表（Order）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否为空 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| O\_id | varchar | 订单编号 | 是 | 10 | 否 | - |
| C\_id | int | 用户编号 | 否 | 10 | 否 | foreign key（Comsumer:C\_id） |
| O\_time | datetime | 下单时间 | 否 | - | 否 | - |
| O\_totalprice | double | 订单总价 | 否 | - | 否 | - |
| O\_status | int | 订单状态（取值为0或1） | 否 | - | 否 | - |

### 表7 菜谱\_订单信息表（Menu\_Order）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 是否可以为空 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| O\_id | string | 订单编号 | 否 | 10 | 否 | foreign key（Order:O\_id） |
| M\_id | int | 菜品编号 | 否 | 10 | 否 | foreign key（Menu:M\_id） |
| M\_name | varchar | 菜品名 | 否 | 30 | 否 | foreign key（Menu:M\_name） |
| M0\_num | int | 菜品数量 | 否 | 10 | 否 | - |
| MO\_price | double | 单菜品消费金额 | 否 | 10 | 否 | - |

# 网页端：

## 管理员登录模块

### 表8 管理员信息表（Manager）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| MA\_id | int | 管理员id号 | 是 | 20 | - | 否 |
| MA\_password | varchar | 管理员登录密码 | 否 | 20 | - | 否 |
| MA\_phone | int | 管理员账号（电话号码） | 否 | 20 | - | 否 |

## 1.反馈模块

表5用户评价表（evaluate），表5用户投诉信息表（Feedback）

## (3)数据统计模块

从表6订单信息表（Order）、表7 菜谱\_订单信息表（Menu\_Order）、表4 菜品信息表（Menu）

中获取数据，通过计算形成新的数据

### 表9 日数据统计信息表（Day）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 |
| --- | --- | --- | --- | --- | --- |
| D\_id | int | 每日统计编号 | 是 | 10 | - |
| D\_income | double | 每日收入 | 否 | 20 | - |
| D\_expend | double | 每日支出 | 否 | 20 | - |
| D\_profit | double | 每日利润 | 否 | 20 | - |

### 表10 日总体菜品数据统计信息表（Day\_Menu）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| D\_id | int | 每日统计编号 | 否 | 10 | foreign key（Day：D\_id） | 否 |
| M\_id | int | 菜品编号 | 否 | 10 | foreign key（Menu:M\_id） | 否 |
| M\_name | varchar | 菜品名 | 否 | 30 | foreign key（Menu:M\_name） | 否 |
| DM\_num | int | 每日总体单菜品总销售量 | 否 | 20 | - | 否 |
| DM\_income | double | 每日单菜品总体销售金额 | 否 | 20 | - | 否 |
| DM\_expand | double | 每日单菜品总体支出金额 | 否 | 20 | - | 否 |
| DM\_profit | double | 每日单菜品总体收获利润 | 否 | 20 | - | 否 |

### 表11 日个人数据统计信息表（Day\_Personal）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: |
| DP\_id | int | 每日统计编号 | 是 | 10 | - |
| DP\_calorie | double | 每日个人总卡路里 | 否 | 20 | - |
| DP\_expend | double | 每日个人总支出 | 否 | 20 | - |

不用加时间，id特定日期就好，0916这样

### 表12 日个人菜品数据统计信息表（Day\_MP）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| DP\_id | int | 每日统计编号 | 否 | 10 | foreign key（Day\_Personal:DP\_id） | 否 |
| M\_id | int | 菜品编号 | 否 | 10 | foreign key（Menu:M\_id） | 否 |
| M\_name | varchar | 菜品名 | 否 | 30 | foreign key（Menu:M\_name） | 否 |
| C\_id | int | 用户编号 | 是 | 20 | foreign key（Comsumer:C\_id） | 否 |
| DMP\_num | int | 每日个人单菜品数量 | 否 | 20 | - | 否 |
| DMP\_calorie | double | 每日个单菜品总卡路里 | 否 | 20 | - | 否 |

### 表13 月数据统计信息表（Month）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: |
| MON\_id | int | 每月统计编号 | 是 | 10 | - |
| MON\_income | double | 每月收入 | 否 | 20 | - |
| MON\_expend | double | 每月支出 | 否 | 20 | - |
| MON\_profit | double | 每月利润 | 否 | 20 | - |

### 表14 月总体菜品数据统计信息表（Month\_Menu）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| MON\_id | int | 每月统计编号 | 否 | 10 | foreign key（Month：MON\_id） | 否 |
| M\_id | int | 菜品编号 | 否 | 10 | foreign key（Menu:M\_id） | 否 |
| M\_name | varchar | 菜品名 | 否 | 30 | foreign key（Menu:M\_name） | 否 |
| MM\_num | int | 每月总体单菜品总销售量 | 否 | 20 | - | 否 |
| MM\_income | double | 每月单菜品总体销售金额 | 否 | 20 | - | 否 |
| MM\_expand | double | 每月单菜品总体支出金额 | 否 | 20 | - | 否 |
| MM\_profit | double | 每月单菜品总体收获利润 | 否 | 20 | - | 否 |

### 表15 月个人数据统计信息表（Month\_Personal）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: |
| MP\_id | int | 每月统计编号 | 是 | 10 | - |
| MP\_calorie | double | 每月个人总卡路里 | 否 | 20 | - |
| MP\_expend | double | 每月个人总支出 | 否 | 20 | - |

### 表16 月个人菜品数据统计信息表（Month\_MP）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| MP\_id | int | 每月统计编号 | 否 | 10 | foreign key（Month\_Personal:MP\_id） | 否 |
| --- | --- | --- | --- | --- | --- | --- |
| M\_id | int | 菜品编号 | 否 | 10 | foreign key（Menu:M\_id） | 否 |
| M\_name | varchar | 菜品名 | 否 | 30 | foreign key（Menu:M\_name） | 否 |
| C\_id | int | 用户编号 | 是 | 20 | foreign key（Comsumer:C\_id） | 否 |
| MMP\_num | int | 每月个人单菜品数量 | 否 | 20 | - | 否 |
| MMP\_calorie | double | 每月个单菜品总卡路里 | 否 | 20 | - | 否 |

### 表17 年数据统计信息表（Year）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: |
| Y\_id | int | 每年统计编号 | 是 | 10 | - |
| Y\_income | double | 每日收入 | 否 | 20 | - |
| Y\_expend | double | 每日支出 | 否 | 20 | - |
| Y\_profit | double | 每日利润 | 否 | 20 | - |

### 表18 年总体菜品数据统计信息表（Year\_Menu）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| Y\_id | int | 每年统计编号 | 否 | 10 | foreign key（Year：Y\_id） | 否 |
| M\_id | int | 菜品编号 | 否 | 10 | foreign key（Menu:M\_id） | 否 |
| M\_name | varchar | 菜品名 | 否 | 30 | foreign key（Menu:M\_name） | 否 |
| YM\_num | int | 每年总体单菜品总销售量 | 否 | 20 | - | 否 |
| YM\_income | double | 每年单菜品总体销售金额 | 否 | 20 | - | 否 |
| YM\_expand | double | 每年单菜品总体支出金额 | 否 | 20 | - | 否 |
| YM\_profit | double | 每年单菜品总体收获利润 | 否 | 20 | - | 否 |

### 表19 年个人数据统计信息表（Year\_Personal）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 |
| :-: | :-: | :-: | :-: | :-: | :-: |
| YP\_id | int | 每年统计编号 | 是 | 10 | - |
| YP\_calorie | double | 每年个人总卡路里 | 否 | 20 | - |
| YP\_expend | double | 每年个人总支出 | 否 | 20 | - |

### 表20 年个人菜品数据统计信息表（Year\_MP）

| 字段名称 | 类型 | 字段说明 | 是否主键 | 长度 | 外键 | 是否可为空 |
| :-: | :-: | :-: | :-: | --- | :-: | :-: |
| YP\_id | int | 每年统计编号 | 否 | 10 | foreign key（Year\_Personal:YP\_id） | 否 |
| M\_id | int | 菜品编号 | 否 | 10 | foreign key（Menu:M\_id） | 否 |
| M\_name | varchar | 菜品名 | 否 | 30 | foreign key（Menu:M\_name） | 否 |
| C\_id | int | 用户编号 | 是 | 20 | foreign key（Comsumer:C\_id） | 否 |
| YMP\_num | int | 每年个人单菜品数量 | 否 | 20 | - | 否 |
| YMP\_calorie | double | 每年个单菜品总卡路里 | 否 | 20 | - | 否 |

