package se.citerus.cqrs.bookstore.admin.web.transport;

import se.citerus.cqrs.bookstore.TransportObject;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RegisterPublisherRequest extends TransportObject {

  @NotNull
  public String publisherContractId;
  @NotNull
  public String publisherName;
  @Min(1)
  public double feePercentage;
  @Min(1)
  public long limit;

}