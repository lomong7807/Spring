/**
 * 
 */

			$(function(){
				
				// User2
				$('#btnUser3s').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user3',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser3').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user3/A101',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser3Register').click(function(){
					
					const jsonData = {
						id: 's101',
						name: '홍길동',
						hp: '010-1111-1001',
						age: 22
					};
					
					$.ajax({
						type: 'POST',
						url: '/Ch10/user3',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser3Modify').click(function(){
					
					const jsonData = {
						id: 's101',
						name: '홍길동',
						hp: '010-2222-1001',
						age: 23
					};
					
					$.ajax({
						type: 'PUT',
						url: '/Ch10/user3',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser3Delete').click(function(){
					$.ajax({
						type: 'DELETE',
						url: '/Ch10/user3/s101',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				
				
			});
			