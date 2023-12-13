# Todo    

## 필수 미션 1: 회원 기능  
가입  
- [x] GET /member/join : 가입 폼  
- [x] POST /member/join : 가입 폼 처리  
  
로그인  
- [x] GET /member/login : 로그인 폼  
- [x] POST /member/login : 로그인 폼 처리  
  
로그아웃  
- [x] POST /member/logout : 로그아웃  
  
## 필수 미션 2: 글 CRUD  
홈  
- [x] GET / : 홈  
  
글 목록 조회  
- [ ] GET /post/list : 전체 글 리스트  
  
내 글 목록 조회  
- [ ] GET /post/myList : 내 글 리스트  
  
글 상세내용 조회  
- [x] GET /post/1 : 1번 글 상세보기  
  
글 작성  
- [ ] GET /post/write : 글 작성 폼  
- [ ] POST /post/write : 글 작성 처리  
  
글 수정  
- [ ] GET /post/1/modify : 1번 글 수정 폼  
- [ ] PUT /post/1/modify : 1번 글 수정 폼 처리  
  
글 삭제  
- [ ] DELETE /post/1/delete : 1번 글 삭제  
  
특정 회원의 글 모아보기  
- [ ] GET /b/user1 : 회원 user1 의 전체 글 리스트  
- [ ] GET /b/user1/3 : 회원 user1 의 글 중에서 3번글 상세보기  