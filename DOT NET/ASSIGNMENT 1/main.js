function compute() {
  var message = ['You really need to do better', 'Try next time', 'Not bad', 'Good job']
  var count = 0;
  if (document.Ques.mcq1.value == "Kinshasa") {
    count ++;
  }
  if (document.Ques.mcq2.value == "Pretoria") {
    count ++;
  }
  if (document.Ques.mcq3.value == "Bangui") {
    count ++;
  }
  document.getElementById("Answer").innerHTML = message[count] + '</br></br>You got ' + count + ' correct.';
}

function reset() {
  document.getElementById("Answer").innerHTML = '';
  radio_reset("mcq1");
  radio_reset("mcq2");
  radio_reset("mcq3");
}

function radio_reset(groupName) {
  var res = document.getElementsByName(groupName);
	for (var i = 0; i < res.length; i ++){
    res[i].checked = false;
  }
}
