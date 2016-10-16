package com.email.sengrid;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

public class SengridEmail {
  public static void main(String[] args) throws IOException {
    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
    try {
      Request request = new Request();
      request.method = Method.GET;
      request.endpoint = "2b1yrX9ATKu3tGDGVg9lOg";
      Response response = sg.api(request);
      System.out.println(response.statusCode);
      System.out.println(response.body);
      System.out.println(response.headers);
    } catch (IOException ex) {
      throw ex;
    }
  }
}