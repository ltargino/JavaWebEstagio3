<script type="text/javascript">

$(document).ready(function() {
  $('select').material_select();
});

$(".button-collapse").sideNav({
    menuWidth: 300, // Default is 300
    edge: 'right', // Choose the horizontal origin
    closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
    draggable: true, // Choose whether you can drag to open on touch screens,
    onOpen: function(el) { /* Do Stuff*/ }, // A function to be called when sideNav is opened
    onClose: function(el) { /* Do Stuff*/ }, // A function to be called when sideNav is closed
});

function ConfirmDelete (url_request_delete){
	$('#ConfirmDeleteModal').modal({
	      dismissible: true, // Modal can be dismissed by clicking outside of the modal
	      opacity: .5, // Opacity of modal background
	      inDuration: 300, // Transition in duration
	      outDuration: 200, // Transition out duration
	      startingTop: '4%', // Starting top style attribute
	      endingTop: '10%', // Ending top style attribute
	      ready: function(modal, trigger) { // Callback for Modal open. Modal and trigger parameters available.
	      },
	      complete: function() {
	      },
		  delete_url: url_request_delete    
	});
	document.getElementById('ConfirmDeleteModal').setAttribute('delete_url',url_request_delete);
	$('#ConfirmDeleteModal').modal('open');
}

function DeleteHttpRequest(url_request_delete) {
  	var the_arr = window.location.href.split('/');
  	the_arr.pop();
    $.get( the_arr.join('/')+"/"+document.getElementById('ConfirmDeleteModal').getAttribute('delete_url') );
	reload();
}

</script>