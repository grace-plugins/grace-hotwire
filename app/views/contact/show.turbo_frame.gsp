<turbo-frame id="showContact">
    <div class="modal fade" id="contactModal" tabindex="-1">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title fs-5" id="contactModalLabel">Show Contact#${contact.id}</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="row pb-3">
                        <label for="firstName" class="col-sm-3 col-form-label text-end">First Name</label>
                        <div class="col-sm-9">
                            <input type="text" readonly class="form-control-plaintext" id="firstName" value="${contact.firstName}">
                        </div>
                    </div>
                    <div class="row pb-3">
                        <label for="lastName" class="col-sm-3 col-form-label text-end">Last Name</label>
                        <div class="col-sm-9">
                            <input type="text" readonly class="form-control-plaintext" id="lastName" value="${contact.lastName}">
                        </div>
                    </div>
                    <div class="row pb-3">
                        <label for="email" class="col-sm-3 col-form-label text-end">Email</label>
                        <div class="col-sm-9">
                            <input type="text" readonly class="form-control-plaintext" id="email" value="${contact.email}">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</turbo-frame>