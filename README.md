# Stackery Hello World - Java

This is a sample template for a serverless AWS Lambda application, written in Java.

This application contains two Lambda Functions.  getWelcomePage function
responds to web request events from an API Gateway endpoint.  logErrors
processes a centralized stream of all Lambda error within this app.

The application arcitecture is defined in template.yaml, a Serverless
Application Model (SAM) template which can be managed through the Stackery UI
at app.stackery.io.

Here is an overview of the files:

```bash
.
├── README.md                          <-- This README file
├── src                                <-- Source code dir for all AWS Lambda functions
│   ├── getWelcomePage                 <-- Source code dir for getWelcomePage function
│   │   ├── README.md                  <-- Function specific README
│   │   ├── build.gradle               <-- Gradle dependencies
│   │   ├── .stackery-config.yaml      <-- Default CLI parameters for this directory
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── Handler.java   <-- Lambda function code
│   │           └── resources
│   │               └── welcome.html   <-- HTML welcome page returned by function
├── .stackery-config.yaml              <-- Default CLI parameters for root directory
└── template.yaml                      <-- SAM infrastructure-as-code template
```

