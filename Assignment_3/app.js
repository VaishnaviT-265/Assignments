$(document).ready(function() {
    $('#applicationForm').submit(function(event) {
        event.preventDefault(); // Prevent the default form submission
        
        // Get form data
        var formData = {
            'Name': $('input[name=Name]').val(),
            'Mobile Number': $('input[name=MobileNumber]').val(),
            'Email': $('input[name=Email]').val(),
            'Address': $('input[name=Address]').val()
        };

        // Display submitted data using SweetAlert
        Swal.fire({
            title: "Submitted Data",
            html: "<b>Name:</b> " + formData.Name + "<br>" +
                  "<b>Mobile Number:</b> " + formData['Mobile Number'] + "<br>" +
                  "<b>Email:</b> " + formData.Email + "<br>" +
                  "<b>Address:</b> " + formData.Address,
            icon: "success",
            confirmButtonText: "OK"
        });
    });
});
