// TODO: Replace with your project's config object. You can find this
// by navigating to your project's console overview page
// (https://console.firebase.google.com/project/your-project-id/overview)
// and clicking "Add Firebase to your web app"
  var config = {
    apiKey: "AIzaSyCa29VPecOz80tw6LdK8snhjMbtj71_V4g",
    authDomain: "tutorial-ab220.firebaseapp.com",
    databaseURL: "https://tutorial-ab220.firebaseio.com",
    storageBucket: "tutorial-ab220.appspot.com",

  };

//Initialize your Firebase app
firebase.initializeApp(config);

//Reference to the recommendations object in your Firebase database
var recommendations = firebase.database().ref("recommendations");

//Save a new recommendation to the database, using the input in the form
var submitRecommendation = function () {

// Get input values from each of the form elements
var title = $("#talkTitle").val();
var presenter = $("#talkPresenter").val();
var link = $("#talkLink").val();

// Push a new recommendation to the database using those values
recommendations.push({
 "title": title,
 "presenter": presenter,
 "link": link
});
};

//Get the single most recent recommendation from the database and
//update the table with its values. This is called every time the child_added
//event is triggered on the recommendations Firebase reference, which means
//that this will update EVEN IF you don't refresh the page. Magic.
recommendations.limitToLast(1).on('child_added', function(childSnapshot) {
// Get the recommendation data from the most recent snapshot of data
// added to the recommendations list in Firebase
recommendation = childSnapshot.val();

// Update the HTML to display the recommendation text
$("#title").html(recommendation.title)
$("#presenter").html(recommendation.presenter)
$("#link").html(recommendation.link)

// Make the link actually work and direct to the URL provided
$("#link").attr("href", recommendation.link)
});

//When the window is fully loaded, call this function.
//Note: because we are attaching an event listener to a particular HTML element
//in this function, we can't do that until the HTML element in question has
//been loaded. Otherwise, we're attaching our listener to nothing, and no code
//will run when the submit button is clicked.
$(window).load(function () {

// Find the HTML element with the id recommendationForm, and when the submit
// event is triggered on that element, call submitRecommendation.
$("#recommendationForm").submit(submitRecommendation);

});

/*
// TODO: Replace with your project's config object. You can find this
// by navigating to your project's console overview page
// (https://console.firebase.google.com/project/your-project-id/overview)
// and clicking "Add Firebase to your web app"
 var config = {
    apiKey: "AIzaSyAW-kLlA4tISaH5bpNQ3-3NZoZ2T7DGjA8",
    authDomain: "erq-masshacks.firebaseapp.com",
    databaseURL: "https://erq-masshacks.firebaseio.com", 
    storageBucket: "erq-masshacks.appspot.com",
  };


//Initialize your Firebase app
firebase.initializeApp(config);

//Reference to the recommendations object in your Firebase database
var submission = firebase.database().ref("submission");

//Save a new recommendation to the database, using the input in the form
var submitSubmission = function () {

// Get input values from each of the form elements
var firstName = $("#firstName").val();
var lastName = $("#lastName").val();
var phone = $("#phone").val();

// Push a new recommendation to the database using those values
submission.push({
 "firstName": firstName,
 "lastName": lastName,
 "phone": phone

});
};

//Get the single most recent recommendation from the database and
//update the table with its values. This is called every time the child_added
//event is triggered on the recommendations Firebase reference, which means
//that this will update EVEN IF you don't refresh the page. Magic.
submission.limitToLast(1).on('child_added', function(childSnapshot) {
// Get the recommendation data from the most recent snapshot of data
// added to the recommendations list in Firebase
submission = childSnapshot.val();



//When the window is fully loaded, call this function.
//Note: because we are attaching an event listener to a particular HTML element
//in this function, we can't do that until the HTML element in question has
//been loaded. Otherwise, we're attaching our listener to nothing, and no code
//will run when the submit button is clicked.
$(window).load(function () {

// Find the HTML element with the id recommendationForm, and when the submit
// event is triggered on that element, call submitRecommendation.
$("#submissionForm").submit(submitSubmission);

});
*/