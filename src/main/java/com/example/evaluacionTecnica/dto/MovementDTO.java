package com.example.evaluacionTecnica.dto;

import java.util.Date;
import java.util.List;

import com.example.evaluacionTecnica.dat.CustomDateDeserializer;
import com.example.evaluacionTecnica.models.Product;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovementDTO {
	   private String subscriptionId;
	    private String frameworkAgreementId;
	    private String paymentMethodType;
	    private List<Product> products;
	    private String traceId;
	    private String alias;
	    private String emailAddress;
	    private String transactionDateTime;
	    private String creationDate;
	    private String subscriptionStatus;
	    private boolean activation;
	    private boolean isDeleted;
}
