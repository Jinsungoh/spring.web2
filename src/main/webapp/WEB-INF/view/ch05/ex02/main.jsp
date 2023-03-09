<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<script>
function listUser(){
	$.ajax({
		url:'user/list',
		success: userList => {
			users = []
			userList.forEach(user =>{
				users.push(
						'<li>' +
							user.userId + ',' +
							user.username + ',' +
							user.birthday +
							'</li>')
			})
			
			$('#userList').empty()
			$('#userList').addend(user.join(''))
		}
	})
}
</script>
<form>
	ID:<input type='number' id='userId'/><br>
	이름:<input type='text' id='username'/><br>
	생일:<input type='date' id='birthday'/><br>
</form>

<nav>
	<button type='button' id='addUserBtn'>추가</button>
	<button type='button' id='fixUserBtn'>수정</button>
	<button type='button' id='delUserBtn'>삭제</button>
</nav>

<ul id='userList'></ul>