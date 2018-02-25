// TODO: Replace with your project's config object. You can find this
// by navigating to your project's console overview page
// (https://console.firebase.google.com/project/your-project-id/overview)
// and clicking "Add Firebase to your web app"
var config = {
    apiKey: "AIzaSyAW-kLlA4tISaH5bpNQ3-3NZoZ2T7DGjA8",
    authDomain: "erq-masshacks.firebaseapp.com",
    databaseURL: "https://erq-masshacks.firebaseio.com",
    projectId: "erq-masshacks",
    storageBucket: "erq-masshacks.appspot.com",
    messagingSenderId: "556678593365"
  };

firebase.initializeApp(config);

var Forms = firebase.database().ref("IndexResponse");

var submitForm = function () {

var firstname = $("#firstName").val();
var lastname = $("#lastName").val();
var phone = $("#phoneNumber").val();
var sneezing = $("#sneezing").val();
var runnyNose = $("#runnyNose").val();
var stuffyNose = $("#stuffyNose").val();
var cough = $("#cough").val();
var soreThroat = $("#soreThroat").val();
var fever = $("#fever").val();
var fatigue1 = $("#fatigue1").val();
var fatigue2 = $("#fatigue2").val();
var headache = $("#headache").val();
var chills = $("#chills").val();
var musclePain = $("#musclePain").val();
var vomiting = $("#vomiting").val();
var breathing = $("#breathing").val();
var difficultySpeaking = $("#difficultySpeaking").val();
var shaking = $("#shaking").val();
var dizziness = $("#dizziness").val();
var tingling = $("#tingling").val();
var fever1 = $("#fever1").val();
var immunizations = $("#immunizations").val();
var respiratoryAllergy = $("#respiratoryAllergy").val();
var medication = $("#medication").val();
var asthma = $("#asthma").val();
var tuberculosis = $("#tuberculosis").val();
var cysticFibrosis = $("#cysticFibrosis").val();
var pulmonaryHypertension = $("#pulmonaryHypertension").val();
var ards = $("#ards").val();
var pneumonia = $("#pneumonia").val();
var x = $("#phoneNumber").val();
var y = $("#sneezing").val();*/

Forms.push({
 "first-name": firstname,
 "last-name": lastname,
 "phone": phone
 "sneezing": sneezing,
 "runnyNose": runnyNose,
 "stuffyNose": stuffyNose,
 "cough": cough,
 "soreThroat": soreThroat,
 "fever": "fever",
 "fatigue1": fatigue1,
 "fatigue2": fatigue2,
 "headache": headache,
 "chills": chills,
 "musclePain": musclePain,
 "vomiting": vomiting,
 "breathing":breathing,
 "difficultySpeaking": difficultySpeaking
});
};


Forms.limitToLast(1).on('child_added', function(childSnapshot) {

form = childSnapshot.val();

$("#link").attr("href", form.link)
});

$(window).load(function () {

$("#recommendationForm").submit(submitForm);

});


