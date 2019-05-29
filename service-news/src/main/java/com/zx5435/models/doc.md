DO,DTO和VO的使用

DO:对应数据库表结构

VO：一般用于前端展示使用

DTO：用于数据传递。（接口入参和接口返回值都可以）

以ssm框架为例：

controller层：

public List<UserVO> getUsers(UserDTO userDto);

 

Service层：

 List<UserDTO> getUsers(UserDTO userDto);

 

DAO层：

List<UserDTO> getUsers(UserDO userDo);