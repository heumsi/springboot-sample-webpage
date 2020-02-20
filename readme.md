# springboot-sample-webpage

스프링 부트를 이용하여 간단한 웹 페이지를 만드는 예제입니다.
스프링과 스프링 부트와 JPA 개념과 기초를 배우고난 뒤, 간단한 웹 페이지를 만드며 배운 내용을 실습하고자 하는 목적으로 만들어 졌습니다.

현재는 간단한 CRUD 컨트롤러와, 이를 요청/응답 받는 프론트 페이지가 일부 Mustache 로 구현되어 있습니다.
추후 더 TODO 리스트에 있는 목록을 더 개발할 예정입니다.

![](https://user-images.githubusercontent.com/31306282/74914135-3d67bd80-5405-11ea-904d-05ec6d715ed1.png)


## 의존성 및 버전 정보
- 백엔드 : SpringBoot 2.2.4.RELEASE
- 템플릿 엔진 : Mustache
- Database : Mysql
- 프로젝트 관리 : Maven 4.0.0
- IDE : IntelliJ IDEA

웹 서버 및 기타 버전을 명시하지 않은 의존성들은 모두 SpringBoot 의 자동설정을 따르고 있습니다.

## 설치 

```bash
git clone https://github.com/heumsi/springboot-sample-webpage
```

## 실행방법

### DB 설정 

가장 먼저 해야할 일은 DB 설정입니다.  
먼저 Mysql 을 띄워주시고, 사용할 database 를 하나 만들어주세요.  
해당 database 의 timezone 은 한국으로 설정되어야 합니다.  
이와 관련된 이슈는 [다음](https://offbyone.tistory.com/318)을 참고하세요.

이후, 설정 파일을 하나 추가해야 합니다.  
`src/main/resources/` 경로에 `application-db.properties` 를 다음과 같이 만들어주세요.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/{사용할 database 이름}
spring.datasource.username={database 계정 아이디}
spring.datasource.password={database 계정 비밀번호}
```

여기까지 완료되었으면 다음엔 앱구동을 하시면 됩니다.

### 앱 구동

#### IntelliJ 임포트

가장 쉬운 방법은 IntelliJ IDEA 에서 이 프로젝트를 임포트 하는 것입니다.  
이 프로젝트는 IntelliJ IDEA IDE 위에서 만들어졌습니다.  
임포트 후 `Application Run` 하시면 됩니다.

#### JAR 파일로 만든 후 실행

이 프로젝트는 Maven 으로 관리되고 있습니다.  
따라서 mvn package 으로 .jar 파일을 만드신 후, 해당 .jar 파일을 실행하시면 됩니다.

## TO-DO list

추후 더 개발이 필요한 리스트 목록입니다.

### UX / 뷰 디테일
- [ ] 더 이상 표시할 아이템이 없을 경우, 목록 더보기 버튼 사라지게 하기
- [ ] 각 필드에 따른 아이템 정렬 작업

### 기능 
- [ ] Project, Article 모델에 published 및 날짜 관련 필드 추가/수정
- [ ] Response 객체 
- [ ] Security 적용해서 글 추가, 수정, 삭제 기능은 Admin 에만 포함시키기

### 성능
- [ ] JS 임포트 해오는 부분 로드 속도 최적화
- [ ] 이미지 DB 저장 관련 용량 최적화

### 테스트
- [ ] CRUD 관련 테스트 코드 구현

### 배포
- [ ] SQL scheme 정의 및 실행 시 샘플 아이템 자동 삽입.
- [ ] AWS 로 데모 페이지 배포

### 그 다음 버전 작업
- [ ] RESTful 한 페이지를 위한 클라이언트 / 서버 코드 분리
- [ ] Admin 페이지 만들기 
