# Project 'Oneul'


> 나의 하루를 정리하고 진정성있게 소통하는 공간

목차 

## 1. 제작 기간 & 참여 인원

- 2021년 6월 10일 ~ 7월 12일
- 팀 프로젝트 총 6명

## 2. 사용 기술

### `Back-end`

- Java 8
- Spring Boot 2.3
- Maven
- MySQL 5.7
- Mybatis
- Thymeleaf
- AWS Cloud EC2 웹호스팅 [http://3.130.183.198:8080/](http://3.130.183.198:8080/)

### `Front-end`

- ES6
- HTML
- CSS

## 3. ERD 설계

![https://github.com/haileykim2014/portfolio/blob/main/oneul/oneul_erd.jpg?raw=true](https://github.com/haileykim2014/portfolio/blob/main/oneul/oneul_erd.jpg?raw=true)

## 4. 구현 기능 화면 캡쳐

제가 구현한 기능은 자유일기시스템 및 댓글시스템입니다.

사용자는 하루의 기분과 생각 및 사진을 기록 할 수 있고,  공개 여부를 통해 다른 사람들과 소통이 가능합니다.

### 4.1. 자유일기 목록 화면

- 사용자는 본인이 작성한 일기의 목록을 확인 할 수 있습니다.
- 첨부파일이 있는 일기의 경우 축소된 사진과 일기 내용이 간략히 표시됩니다.
- 댓글갯수와 일기 공개여부가 각 일기의 하단에 표시됩니다.

![https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5329a993-61d5-46f4-843f-03e1e6669215/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094215Z&X-Amz-Expires=86400&X-Amz-Signature=489912abfb5d5755d9bb12fd85bf059d85575218fef69aa312ea1fbe24c16e92&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5329a993-61d5-46f4-843f-03e1e6669215/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094215Z&X-Amz-Expires=86400&X-Amz-Signature=489912abfb5d5755d9bb12fd85bf059d85575218fef69aa312ea1fbe24c16e92&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

### 4.2. 자유일기 등록 화면

- 일기 등록시 현재 날짜가 기본으로 설정되며 희망하는 날짜 선택이 가능합니다.
- 각 일기별로 감정 이모티콘을 선택 할 수 있습니다.
- 사진을 첨부할 수 있으며 미리보기가 제공됩니다.
- 일기 작성을 돕기 위한 질문이 제공됩니다.
- 일기공개 여부를 선택하여 다른 사람들과 소통할 수 있습니다.

![https://s3.us-west-2.amazonaws.com/secure.notion-static.com/33312f35-c458-49bd-8553-4deba72de417/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094252Z&X-Amz-Expires=86400&X-Amz-Signature=95c92fc1682c1e5f06c1f14b53e8ae76d6b5487d342d5d28db9b037a2df1b745&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/33312f35-c458-49bd-8553-4deba72de417/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094252Z&X-Amz-Expires=86400&X-Amz-Signature=95c92fc1682c1e5f06c1f14b53e8ae76d6b5487d342d5d28db9b037a2df1b745&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

### 4.3. 자유일기 상세 화면

- 사용자가 등록한 일기의 상세내역입니다.
- 감정, 날짜,  사진, 내용 및 공개 여부를 확인 할 수 있습니다.
- 상세페이지 내 우측상단 버튼을 통해 수정 및 삭제가 가능합니다.
- 일기 내용 하단에는 각 일기의 댓글이 보입니다.

![https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e4bbc2d9-6ba3-46d6-917e-9a2b27b7286b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094320Z&X-Amz-Expires=86400&X-Amz-Signature=0418c75ed694568d0b61c45fc0bdc30abe68894c1f4ecc2e29cdd7da0f31859a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e4bbc2d9-6ba3-46d6-917e-9a2b27b7286b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094320Z&X-Amz-Expires=86400&X-Amz-Signature=0418c75ed694568d0b61c45fc0bdc30abe68894c1f4ecc2e29cdd7da0f31859a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

### 4.4. 댓글 목록

- 사용자는 공개되어있는 일기에 댓글을 남길 수 있습니다.
- 자신이 작성한 댓글에 수정,삭제 버튼이 활성화 됩니다.

![https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9e94d3ee-eb00-4e01-8d2d-0c1708ddfc70/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094343Z&X-Amz-Expires=86400&X-Amz-Signature=7a68bc5e19ee6b7a7bf81a230e9570d5aeb1fdce9b5a50231210dc4e16afc617&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9e94d3ee-eb00-4e01-8d2d-0c1708ddfc70/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094343Z&X-Amz-Expires=86400&X-Amz-Signature=7a68bc5e19ee6b7a7bf81a230e9570d5aeb1fdce9b5a50231210dc4e16afc617&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

### 4.5. 대댓글 등록 화면

- 사용자는 댓글의 댓글을 작성할 수 있습니다.
- 부모댓글의 댓글버튼을 누르면 대댓글 작성을 위한 팝업창이 생깁니다.

![https://s3.us-west-2.amazonaws.com/secure.notion-static.com/973286aa-43b6-4249-9b2a-0c56db4ea857/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094405Z&X-Amz-Expires=86400&X-Amz-Signature=7a912ba8f549dcbc029a258dbe6e2396c64a3c8c74c125c5a618beb7efce9471&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/973286aa-43b6-4249-9b2a-0c56db4ea857/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210831T094405Z&X-Amz-Expires=86400&X-Amz-Signature=7a912ba8f549dcbc029a258dbe6e2396c64a3c8c74c125c5a618beb7efce9471&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

## 5. 구현 기능 흐름 및 구조

### 5.1. 전체 흐름

![https://github.com/haileykim2014/portfolio/blob/main/oneul/oneul-overview.jpg?raw=true](https://github.com/haileykim2014/portfolio/blob/main/oneul/oneul-overview.jpg?raw=true)

### 5.2. View

- Thymeleaf 사용 : html태그를 기반으로하여 th:속성을 이용하여 동적인 View를 제공
- Controller에서 model에 필요한 데이터를 넣어 전달하고 템플릿엔진에서 전달된 데이터를 사용
    - **자유일기 등록 페이지** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/resources/templates/diary/freeDiary/reg.html)
    - **자유일기 상세 페이지** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/resources/templates/diary/freeDiary/detail.html)
    - **자유일기 수정 페이지** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/resources/templates/diary/freeDiary/edit.html)
    - **자유일기 상세페이지 내 댓글 목록** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/resources/templates/diary/freeDiary/comment.html)

### 5.3. Controller

- **FreeDiaryController** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/controller/FreeDiaryController.java)
    - Controller에서는 요청을 화면단에서 넘어온 요청을 받고, Service 계층에 로직 처리를 위임.

### 5.4. Service

- **FreeDiaryService** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/service/FreeDiaryService.java)
    - 자유일기 시스템에 필요한 서비스목록을 담은 인터페이스
- **FreeDiaryServiceImp** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/service/FreeDiaryServiceImp.java)
    - 일기의 인터페이스를 구현한 클래스
- **FreeDiaryCommentService** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/service/FreeDiaryCommentService.java)
    - 댓글 시스템에 필요한 서비스 목록을 담은 인터페이스
- **FreeDiaryCommentServiceImp** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/service/FreeDiaryCommentServiceImp.java)
    - 댓글의 인터페이스를 구현한 클래스

### 5.5. Repository

Service 계층에서 요청한 Query로 DB에 질의
결과를 다시 Service 계층에 전달

- **FreeDiaryDao** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/dao/FreeDiaryDao.java)
    - 자유일기 다오 인터페이스
- **MyBatisFreeDiaryDao** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/dao/mybatis/MyBatisFreeDiaryDao.java)
    - 인터페이스를 구현한 클래스
- **FreeDiaryCommentDao** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/dao/FreeDiaryCommentDao.java)
    - 댓글 다오 인터페이스
- **MyBatisFreeDiaryCommentDao** 🔍 [코드 확인](https://github.com/haileykim2014/Oneul/blob/main/OneulPrj/src/main/java/com/oneul/web/dao/mybatis/MyBatisFreeDiaryCommentDao.java)
    - 댓글 인터페이스를 구현한 클래스

### 5.6. AWS Cloud 서비스 EC2를 이용해 배포

- [http://3.130.183.198:8080/](http://3.130.183.198:8080/)
- 운영체제 : Amazon Linux - ubuntu
- 로컬 개발환경에서는 윈도우를 사용했다가 운영환경에서는 우분투를 사용해 CLI환경을 경험해 볼 수 있었습니다.
- 배포 후 Web Server와 WAS의 분리의 필요성을 공부 하게 되었습니다. WAS하나로 웹서버 기능까지 구현 할 수 있지만 앞단에 웹서버를 두고 뒷단에 WAS를 둬서 WAS의 책임을 분할해 서버부하를 방지하고 서비스의 확장성 및 안정성을 개선할  수 있다는 것을 배웠습니다.

## 6. 트러블 슈팅

- 댓글 시스템 구현할때 자기를 참조하는 대댓글 개념이 어려웠습니다.
    - 댓글의 하위댓글을 구성하기 위해 DB에 '부모댓글 ID'컬럼추가
    - 댓글 목록 출력
        - Mapper에 부모댓글 목록 및 자식댓글 목록을 각각 적용

        ```xml
        <select id="getMainList" resultType="com.oneul.web.entity.FreeDiaryComment">
        		select * from FreeDiaryComment left join Member as m on m.id = FreeDiaryComment.memberid where freeDiaryId = #{param1} and commentId is null order by regDate asc
        </select>

         <select id="getSubList" resultType="com.oneul.web.entity.FreeDiaryComment">
        	select * from FreeDiaryComment left join Member as m on m.id = FreeDiaryComment.memberid where commentId = #{param1} order by regDate asc
        </select>
        ```

        - FreeDiaryCommentServiceImp에서 부모댓글과 자식댓글의 list를 동시에 불러오는 작업

        ```xml
        @Override
        	public List<FreeDiaryComment> getViewList(int freeDiaryId) {
        		List<FreeDiaryComment> list;
        		list = dao.getMainList(freeDiaryId);
        		for(FreeDiaryComment n : list) {
        			if(n.getCommentId() == null)
        				n.setList(dao.getSubList(n.getId()));			
        		}	
        		
        		return list;
        	}
        ```

## 6. 회고 / 느낀점

> 내가 상상했던 무언가를 직접 만들어서 완성해낸 희열을 느끼게된 프로젝트

[온전히 자신을 위한 시간을 제공하고 싶었습니다.]

'오늘' 이라는 일기 플랫폼을 만들게된 계기는 저의 가까운 친구들을 위해서였습니다.

소소한 일상속 행복들을 음미하고 자기 자신에게 집중할 수 있는 시간을 갖는 좋은 습관을 만들어 주고 싶어 아이디어를 제시했고 아이디어를 마음에 들어하는 학원동기들 6명과 함께 프로젝트를 진행 하게 되었습니다. 또한 공개일기를 통해 서로의 생각을 자연스럽게 공유하고 편하게 소통하게되면서 하루하루 가까워짐을 느꼈습니다. 제 서비스로 사회에 의미있는 변화를 만들고싶다는 생각이 들었습니다.

[지속적인 서비스 및 개선]

반복되는 코드와 효율성을 개선하고 싶습니다. 

매주 화요일에 학원동기들과 spring 스터디를 진행하고 있습니다. 스터디를 통해 현재 코드는 SQL에 의존적이고 반복적인 코드가 발생하는 문제가 있다는 것을 발견했습니다. 이 부분을 개선하기 위한 방법으로 JPA기술이 있다는 것을 알게 되었습니다. JPA를 공부해서 객체 중심적이고 생산성을 높인 코드를 적용해 보고싶습니다.

[GitHub - haileykim2014/Oneul](https://github.com/haileykim2014/Oneul.git)
