package com.wasp.landlordcommunication.controllers;

import com.wasp.landlordcommunication.models.Payment;
import com.wasp.landlordcommunication.services.base.PaymentsService;
import com.wasp.landlordcommunication.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Constants.PAYMENTS_ROOT_MAPPING)
public class PaymentsApiController {

    private final PaymentsService paymentsService;

    @Autowired
    public PaymentsApiController(PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Payment makePayment(@RequestBody @Valid Payment newPayment) {

        return paymentsService.makePayment(newPayment);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Payment getPaymentById(@PathVariable int id) {

        return paymentsService.getPaymentById(id);
    }

    @RequestMapping(value = "/tenant/{tenantId}", method = RequestMethod.GET)
    public List<Payment> getPaymentsByTenantId(@PathVariable int tenantId) {

        return paymentsService.getPaymentsByTenantId(tenantId);
    }

    @RequestMapping(value = "/landlord/{landlordId}", method = RequestMethod.GET)
    public List<Payment> getPaymentsByLandlordId(@PathVariable int landlordId) {

        return paymentsService.getPaymentsByLandlordId(landlordId);
    }
}
