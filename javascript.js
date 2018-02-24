// Config for Firebase Database
var config = {
   apiKey: "AIzaSyAW-kLlA4tISaH5bpNQ3-3NZoZ2T7DGjA8",
   authDomain: "erq-masshacks.firebaseapp.com",
   databaseURL: "https://erq-masshacks.firebaseio.com",
   projectId: "erq-masshacks",
   storageBucket: "",
   messagingSenderId: "556678593365"
 };
firebase.initializeApp(config);

// Reference Firebase
var myFirebase = firebase.database().ref();

// Listening for Form Submission
document.getElementById('intro').addEventListener('submit', submit);

//Creates Object
var submission = myFirebase.child("submission");

// Submit Function
function submit(e){
	e.preventDefault();
	var firstname = 'firstname';
	var lastname = 'lastname';
	var phone = 'phone';
}

// Save Values
saveMessage(firstname, lastname, phone);

// Clear form
document.getElementById('intro').reset();
}

// saveMessage Function
saveMessage(firstname, lastname, phone){
  var newId = submission.push();
  newid.set({
    firstname: firstname,
    lastname: lastname,
    phone: phone
  });
}
