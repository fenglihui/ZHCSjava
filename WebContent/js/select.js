$.fn.selectDate = function(){
			var minYear = 2012;
			var maxYear = (new Date).getFullYear()-1;
			var minManage = 1;
			var maxManage = 50;
			var yearSel = document.getElementById('year');
			var monthSel = document.getElementById('month');
			var manageSel = document.getElementById('manage');
	
			for(var y = maxYear;y >= minYear;y--){
				var yearOpt = document.createElement('option');
				yearOpt.value = y
				yearOpt.innerHTML = y+'年'
				yearSel.appendChild(yearOpt)
			}
			for(var n =2;n<=12;n++){
				var monthOpt = document.createElement('option');
                monthOpt.value = n;
				if( n<10){
					monthOpt.innerHTML = '0' + n + '月';
				}
				else{
					monthOpt.innerHTML = n + '月';
				}
				monthSel.appendChild(monthOpt);
			}
			for(var m =minManage;m<=maxManage;m++){
				var manageOpt = document.createElement('option');
				manageOpt.value ='蔬菜' + m + '号';
				manageOpt.innerHTML = '蔬菜' + m + '号'
				manageSel.appendChild(manageOpt);
			}
		}