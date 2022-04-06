# 스프링부트 JPA 블로그 V3

### 1. 의존성
- devtools
- spring web (mvc)
- mustache
- jpa
- mysql
- lombok
- security
- validation

### 2. DB설정
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
USE greendb;
```

### 3. 에디터
- https://quilljs.com/

### 4. 댓글
- https://livere.com/

### 5. 주소 요청 이렇게
```txt
localhost:8080/  (메인페이지 - 글 있는 곳 아님)
localhost:8080/user/{userId}/post
localhost:8080/user/{userId}/post/{postId}
localhost:8080/user/{userId}/category/{title}
```

### 6. 모델링
```txt
Visit
id
userId
totalCount
createDate
updateDate

User
id
username
password
createDate
updateDate

Post
id
title
content
thumnail
userId
categoryId
createDate
updateDate

Love
id
postId
userId
createDate
updateDate

Category
id
title
userId
createDate
updateDate
```