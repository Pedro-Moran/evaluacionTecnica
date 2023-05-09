package com.example.evaluacionTecnica.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.evaluacionTecnica.dat.CustomDateDeserializer;
import com.example.evaluacionTecnica.dto.MovementDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document()
@NoArgsConstructor
@AllArgsConstructor
public class Movement {
	
	@Id
	private String id;
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
    private boolean isDeleted;
    private boolean activation;
    
    public Movement(MovementDTO movementDTO) {
		this.subscriptionId = movementDTO.getSubscriptionId();
		this.frameworkAgreementId = movementDTO.getFrameworkAgreementId();
		this.paymentMethodType = movementDTO.getPaymentMethodType();
		this.products = movementDTO.getProducts();
		this.traceId = movementDTO.getTraceId();
		this.alias = movementDTO.getAlias();
		this.emailAddress = movementDTO.getEmailAddress();
		this.transactionDateTime = movementDTO.getTransactionDateTime();
		this.creationDate = movementDTO.getCreationDate();
		this.subscriptionStatus = movementDTO.getSubscriptionStatus();
		this.isDeleted = movementDTO.isDeleted();
		this.activation = movementDTO.isActivation();
	}
	

}
