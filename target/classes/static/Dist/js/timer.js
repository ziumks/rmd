/**********
 * 작성자 : jerry@ziumks.com
 * Time : 2017.07.26
 * 현재 날짜 및 시간을 표기하는 라이브러리
 * ***********/

printClock();

function printClock() {

        var clock =$("#clock");            // 출력할 장소 선택
        var currentDate = new Date();                                     // 현재시간
        var calendar = currentDate.getFullYear() + "-" + (currentDate.getMonth() + 1) + "-" + currentDate.getDate() // 현재 날짜
        var amPm = 'AM'; // 초기값 AM
        var currentHours = addZeros(currentDate.getHours(), 2);
        var currentMinute = addZeros(currentDate.getMinutes(), 2);
        var currentSeconds = addZeros(currentDate.getSeconds(), 2);

        if (currentHours >= 12) { // 시간이 12보다 클 때 PM으로 세팅, 12를 빼줌
            amPm = 'PM';
            currentHours = addZeros(currentHours - 12, 2);
        }

        /*  if(currentSeconds >= 50){// 50초 이상일 때 색을 변환해 준다.
              currentSeconds = '<span style="color:#de1951;">'+currentSeconds+'</span>'
          }*/
        var todayDate= currentDate.getFullYear().toString()+"/"+(currentDate.getMonth()+1).toString() +"/"+currentDate.getDate().toString();
        clock.text(todayDate+" "+currentHours + ":" + currentMinute + ":" + currentSeconds + amPm); //날짜를 출력해 줌
        setTimeout("printClock()", 1000);         // 1초마다 printClock() 함수 호출
    }

    function addZeros(num, digit) { // 자릿수 맞춰주기
        var zero = '';
        num = num.toString();
        if (num.length < digit) {
            for (i = 0; i < digit - num.length; i++) {
                zero += '0';
            }
        }
        return zero + num;
    }