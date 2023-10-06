/**
 * 
 */

			$(function(){
				
				// User6
				$('#btnUser6s').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user6',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser6').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user6/24',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser6Register').click(function(){
					
					const jsonData = {
						name: '홍길동',
						gender: 'M',
						age: 22,
						addr: '서면'
					};
					
					$.ajax({
						type: 'POST',
						url: '/Ch10/user6',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser6Modify').click(function(){
					
					const jsonData = {
						seq: 24,
						name: '홍길동',
						gender: 'F',
						age: 30,
						addr: '서면'
					};
					
					$.ajax({
						type: 'PUT',
						url: '/Ch10/user6',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser6Delete').click(function(){
					$.ajax({
						type: 'DELETE',
						url: '/Ch10/user6/24',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				
				
			});
			