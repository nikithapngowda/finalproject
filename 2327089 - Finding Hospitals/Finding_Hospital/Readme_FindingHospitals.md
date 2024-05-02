Case Study: Finding Hospitals

Problem Statement : 

Finding Hospitals

Get the hospital names: 

    1. Get the Hospital names where rating above than 3.5
    2. Get Specialties and price
    
Suggested Site:practo.com however  you are free to choose any other legitimate  site
        
Detailed Description: Hackathon Ideas 

	1. For Bangalore city, identify Hospitals that has rating more than 3.5; Display the hospital names
	2. Go to Book Diagnostic Tests, pick all the top cities name & store in a List; Display the same
	3. Navigate Back to Homepage and under View all specialties, print all specialties along with price
	4. Under For hospitals, click on practo drive Then provide invalid details,capture the warning message
	5. Check whether Instagram is available under social menu.
	
Key Automation Scope:
	
	*Handling alert, different browser windows, search option
	*Navigating back to home page
	*Extract multiple options items & store in collections
	*Filling form (in different objects in web page)
	*Capture warning message	   

Frameworks used:
     
     Maven
     TestNG
     Cucumber

Dependencies:

	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>CarWashServiceDoorWash</groupId>
	<artifactId>CarWashServiceDoorWash</artifactId>
	<version>0.0.1-SNAPSHOT</version>
		 <build>
	<pluginManagement>
	<plugins>
	<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-compiler-plugin</artifactId>
	<version>3.11.0</version>
	</plugin>
	 
	<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-surefire-plugin</artifactId>
	<version>3.1.2</version>
	 
						<configuration>
	<suiteXmlFiles>
	<suiteXmlFile>testng.xml</suiteXmlFile>
	</suiteXmlFiles>
	</configuration>
	 
					</plugin>
	 
	 
				</plugins>
	</pluginManagement>
	</build>
	 
		<dependencies>
	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
	<groupId>org.seleniumhq.selenium</groupId>
	<artifactId>selenium-java</artifactId>
	<version>4.17.0</version>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
	<groupId>org.apache.poi</groupId>
	<artifactId>poi</artifactId>
	<version>5.2.3</version>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
	<groupId>org.apache.poi</groupId>
	<artifactId>poi-ooxml</artifactId>
	<version>5.2.3</version>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
	<groupId>org.testng</groupId>
	<artifactId>testng</artifactId>
	<version>7.5</version>
	<scope>test</scope>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	<dependency>
	<groupId>io.cucumber</groupId>
	<artifactId>cucumber-java</artifactId>
	<version>7.16.1</version>
	</dependency>
	 
	 
			<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
	<dependency>
	<groupId>io.cucumber</groupId>
	<artifactId>cucumber-testng</artifactId>
	<version>7.16.1</version>
	<scope>test</scope>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
	<dependency>
	<groupId>org.apache.logging.log4j</groupId>
	<artifactId>log4j-core</artifactId>
	<version>2.20.0</version>
	</dependency>
	 
	 
			<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
	<dependency>
	<groupId>org.apache.logging.log4j</groupId>
	<artifactId>log4j-api</artifactId>
	<version>2.20.0</version>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
	<dependency>
	<groupId>commons-io</groupId>
	<artifactId>commons-io</artifactId>
	<version>2.11.0</version>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
	<dependency>
	<groupId>org.apache.commons</groupId>
	<artifactId>commons-lang3</artifactId>
	<version>3.12.0</version>
	</dependency>
	 
	 
			<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter -->
	<dependency>
	<groupId>tech.grasshopper</groupId>
	<artifactId>extentreports-cucumber7-adapter</artifactId>
	<version>1.14.0</version>
	</dependency>
	 
			<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
	<dependency>
	<groupId>com.aventstack</groupId>
	<artifactId>extentreports</artifactId>
	<version>5.1.1</version>
	</dependency>
	</dependencies>
	</project>
	     
Output:

	[RemoteTestNG] detected TestNG version 7.5.0
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

Scenario: Capture the hospital name and rating                 # FeaturesFiles/Feature1.feature:3
  Given the user is on Practo Home Page                        # stepDefinition.TC1.the_user_is_on_practo_home_page()

    Embedding Capture the hospital name and rating [image/png 366408 bytes]

  When user will select City from the City Input Field         # stepDefinition.TC1.user_will_select_city_from_the_city_input_field()

    Embedding Capture the hospital name and rating [image/png 341000 bytes]

  And user will select Hospital Type from Type Input Field     # stepDefinition.TC1.user_will_select_hospital_type_from_type_input_field()

    Embedding Capture the hospital name and rating [image/png 191109 bytes]

Greenview Medical Center - 4.5
Manipal Hospitals - 4.0
Manipal Hospital Varthur Road (formerly Columbia Asia Hospital) - 4.0
HOSMAT Hospital - 4.0
Motherhood Hospital - 4.5
Koshys Hospital - 4.0
Apollo Spectra Hospitals - 4.0
Apollo Cradle & Children’s Hospital - 4.5
Chirag Hospital - 4.5
Manipal Hospital - 4.5
Trilife Hospital (formerly Specialist Hospital) - 4.0
People Tree Hospitals - 4.5
NU Hospitals - 4.5
Aster CMI Hospital - 4.5
Marvel Multispeciality Hospital - 4.0
Nano Hospitals - 4.5
Apollo Cradle & Children’s Hospital - 4.5
Cloudnine Hospital - Old Airport Road - 4.5
The Eye Foundation Super Specialty Eye Hospital - 4.5
  Then user will capture the list of Hospital name from rating # stepDefinition.TC1.user_will_capture_the_list_of_hospital_name_from_rating()

    Embedding Capture the hospital name and rating [image/png 366408 bytes]


Scenario: Go to Book Diagnostic Test and pick all top cities name # FeaturesFiles/Feature2.feature:3
  Given the user is on Practo Home Page                           # stepDefinition.TC1.the_user_is_on_practo_home_page()

    Embedding Go to Book Diagnostic Test and pick all top cities name [image/png 366408 bytes]

  When user will select Book Diagnostic Tests                     # stepDefinition.TC2.user_will_select_book_diagnostic_tests()

    Embedding Go to Book Diagnostic Test and pick all top cities name [image/png 130504 bytes]


Number of top cities: 7
Bangalore
Delhi
Mumbai
Chennai
Hyderabad
Kolkata
Pune
  Then user will capture the all top cities name                  # stepDefinition.TC2.user_will_capture_the_all_top_cities_name()

    Embedding Go to Book Diagnostic Test and pick all top cities name [image/png 366040 bytes]


Scenario: Go to View All Specialties and print all specialties with price # FeaturesFiles/Feature3.feature:3
  Given the user is on Practo Home Page                                   # stepDefinition.TC1.the_user_is_on_practo_home_page()

    Embedding Go to View All Specialties and print all specialties with price [image/png 366408 bytes]

  When user will select View All Specialties                              # stepDefinition.TC3.user_will_select_view_all_specialties()

    Embedding Go to View All Specialties and print all specialties with price [image/png 633108 bytes]

Name of Specialty: Gynaecology
Price of Specialty: ₹499
___________________________________
Name of Specialty: Sexology
Price of Specialty: ₹499
___________________________________
Name of Specialty: General physician
Price of Specialty: ₹399
___________________________________
Name of Specialty: Dermatology
Price of Specialty: ₹449
___________________________________
Name of Specialty: Psychiatry
Price of Specialty: ₹499
___________________________________
Name of Specialty: Stomach and digestion
Price of Specialty: ₹399
___________________________________
Name of Specialty: Pediatrics
Price of Specialty: ₹499
___________________________________
Name of Specialty: Urology
Price of Specialty: ₹499
___________________________________
  Then user will capture the all specialties with price                   # stepDefinition.TC3.user_will_capture_the_all_specialties_with_price()

    Embedding Go to View All Specialties and print all specialties with price [image/png 396313 bytes]


Scenario: click on practo drive and enter invalid details              # FeaturesFiles/Feature4.feature:3
  Given the user is on Practo Home Page                                # stepDefinition.TC1.the_user_is_on_practo_home_page()

    Embedding click on practo drive and enter invalid details [image/png 366408 bytes]

  When user will select practo drive                                   # stepDefinition.TC4.user_will_select_practo_drive()

    Embedding click on practo drive and enter invalid details [image/png 89200 bytes]

Enter valid mobile number
  Then user will enter invalid details and capture the warning message # stepDefinition.TC4.user_will_enter_invalid_details_and_capture_the_warning_message()

    Embedding click on practo drive and enter invalid details [image/png 93914 bytes]


Scenario: Check if Instagram is present under Social                                 # FeaturesFiles/Feature5.feature:3
  Given the user is on Practo Home Page                                              # stepDefinition.TC1.the_user_is_on_practo_home_page()

    Embedding Check if Instagram is present under Social [image/png 366408 bytes]

  When The user scroll down to the social menu                                       # stepDefinition.TC5.the_user_scroll_down_to_the_social_menu()

    Embedding Check if Instagram is present under Social [image/png 91869 bytes]

Instagram is not present
  Then User check whether Instagram is present in the list of social media platforms # stepDefinition.TC5.user_check_whether_instagram_is_present_in_the_list_of_social_media_platforms()

    Embedding Check if Instagram is present under Social [image/png 96858 bytes]

PASSED: runScenario("Capture the hospital name and rating", "Finding Hospital - Practo")
        Runs Cucumber Scenarios
PASSED: runScenario("Check if Instagram is present under Social", "Finding Hospital - Practo")
        Runs Cucumber Scenarios
PASSED: runScenario("Go to View All Specialties and print all specialties with price", "Finding Hospital - Practo")
        Runs Cucumber Scenarios
PASSED: runScenario("Go to Book Diagnostic Test and pick all top cities name", "Finding Hospital - Practo")
        Runs Cucumber Scenarios
PASSED: runScenario("click on practo drive and enter invalid details", "Finding Hospital - Practo")
        Runs Cucumber Scenarios

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/24429fb2-a530-4322-8369-1a94624a84b1 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
===============================================
Default suite
Total tests run: 5, Passes: 5, Failures: 0, Skips: 0
===============================================

     


