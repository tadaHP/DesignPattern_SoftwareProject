# SoftwareProject_DesignPattern
3rd Grade_2nd semester mini project  
Desgin Pattern

### 프로젝트 목적
> 한밭대 동아리원끼리 같이 테니스를 치면 좋겠다는 아이디어로부터 시작
> 앱(콘솔)을 이용해서 약속을 잡고, 연락, 게임시드까지 같이 만들어준다.

## 서비스
1. 로그인
2. 매치 생성
3. 매치 생성 알림
4. 게임 시드 생성


## 서비스에 들어가는 패턴(예정)
### 1.로그인
 팩토리 매서드 패턴 -> 대전권 다른 학교도 추가 하면서 회원가입에 문제 발생 예시 이용
 https://bcp0109.tistory.com/367 참고


### 2.경기 생성  
 Builder 패턴: 빌더로 경기 정보를 받아와 생성, 생성시 필요없는 정보는 생략    
 https://wildeveloperetrain.tistory.com/30 참고


### 3.매치생성알림
Observer 패턴: 경기에 참여한 인원들을 Observer에 등록하고 경기가 생성되면 알려준다


### 4. 게임 시드 생성
Strategy패턴: 두가지 전략에 따른 시드 생성 방식 지원


### 5. 매치생성시 싱글톤 패턴
싱글톤 패턴 이용

