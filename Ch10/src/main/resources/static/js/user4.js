/**
 * 
 */

			$(function(){
				
				// User4
				$('#btnUser4s').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user4',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser4').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user4/홍길동',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser4Register').click(function(){
					
					const jsonData = {
						name: '홍길동',
						gender: 'M',
						age: 22,
						addr: '서면'
					};
					
					$.ajax({
						type: 'POST',
						url: '/Ch10/user4',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser4Modify').click(function(){
					
					const jsonData = {
						name: '홍길동',
						gender: 'F',
						age: 30,
						addr: '서면'
					};
					
					$.ajax({
						type: 'PUT',
						url: '/Ch10/user4',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser4Delete').click(function(){
					$.ajax({
						type: 'DELETE',
						url: '/Ch10/user4/홍길동',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				
				
			});
			