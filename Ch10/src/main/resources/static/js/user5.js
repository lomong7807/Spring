/**
 * 
 */

			$(function(){
				
				// User5
				$('#btnUser5s').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user5',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser5').click(function(){
					$.ajax({
						type: 'GET',
						url: '/Ch10/user5/홍길동',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser5Register').click(function(){
					
					const jsonData = {
						name: '홍길동',
						gender: 'M',
						age: 22,
						addr: '서면'
					};
					
					$.ajax({
						type: 'POST',
						url: '/Ch10/user5',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser5Modify').click(function(){
					
					const jsonData = {
						name: '홍길동',
						gender: 'F',
						age: 30,
						addr: '서면'
					};
					
					$.ajax({
						type: 'PUT',
						url: '/Ch10/user5',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				$('#btnUser5Delete').click(function(){
					$.ajax({
						type: 'DELETE',
						url: '/Ch10/user5/홍길동',
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				
				
			});
			