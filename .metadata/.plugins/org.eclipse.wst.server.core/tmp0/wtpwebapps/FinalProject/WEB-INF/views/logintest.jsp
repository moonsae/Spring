<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <ul>
      <li onclick="kakaoLogin();">
        <a href="javascript:void(0)">
          <span>카카오 로그인</span>
        </a>
      </li>
      <li onclick="kakaoLogout();">
        <a href="javascript:void(0)">
          <span>카카오 로그아웃</span>
        </a>
      </li>
    </ul>
    <!-- 카카오 스크립트 -->
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
    <script>
      Kakao.init("60aaf708f2480827abf4c4a7ab34e91c"); //발급받은 키 중 javascript키를 사용해준다.
      console.log(Kakao.isInitialized()); // sdk초기화여부판단
      //카카오로그인
      function kakaoLogin() {
        Kakao.Auth.login({
          success: function (response) {
        	  
        	  
            Kakao.API.request({
              url: "/v2/user/me",
              success: function (response) {
                document.getElementById("id").value = response.id;
                document.getElementById("nickname").value =
                  response.properties.nickname;
                document.getElementById("profile_image").value =
                  response.properties.profile_image;         
                document.getElementById("myForm").submit();
              },
              fail: function (error) {
                console.log(error);
              },
            });
          },
          fail: function (error) {
            console.log(error);
          },
        });
      }
      //카카오로그아웃
      function kakaoLogout() {
        if (Kakao.Auth.getAccessToken()) {
          Kakao.API.request({
            url: "/v1/user/unlink",
            success: function (response) {
              console.log(response);
            },
            fail: function (error) {
              console.log(error);
            },
          });
          Kakao.Auth.setAccessToken(undefined);
        }
      }
    </script>
    
      <form id="myForm"  method="post"   action="/testing/myForm">
      <input type="text" id="id" name="id" value="" />
      <input type="text" id="nickname" name="nickname" value="" />
      <input type="text" id="profile_image" name="profile_image" value="" />      
    </form>
  </body>
</html>