// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery.min
//= require bootstrap.bundle
//= require_self

document.addEventListener("turbo:frame-load", (event) => {
    // Bootstrap modal will show itself when it’s inserted in the DOM as a Turbo Frame
    const frameId = event.target.id;
    const modalElement = document.querySelector("#" + frameId + " .modal");
    if (modalElement) {
        const modalInstance = new bootstrap.Modal(modalElement);
        modalInstance.show();
    }
});