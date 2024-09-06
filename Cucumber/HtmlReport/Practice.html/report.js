$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/featurefile/Testrunner.feature");
formatter.feature({
  "line": 1,
  "name": "booking hotel using adactin application",
  "description": "",
  "id": "booking-hotel-using-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "login functionality",
  "description": "",
  "id": "booking-hotel-using-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter the username in username field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter the password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click the login Button And it navigate to search page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_url()"
});
formatter.result({
  "duration": 421031900,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_INTERNET_DISCONNECTED\n  (Session info: chrome\u003d127.0.6533.120)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-DV3B3KC\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 127.0.6533.120, chrome: {chromedriverVersion: 127.0.6533.119 (bdef6783a05..., userDataDir: C:\\Users\\MY-PC\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53557}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 89f66979f0c250d632b1459782a7cdf6\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.baseclass.Baseclass_cucumber.geturl(Baseclass_cucumber.java:15)\r\n\tat com.stepdefinition.Stepdefinition.user_launch_the_url(Stepdefinition.java:24)\r\n\tat ✽.Given user launch the url(src/test/java/com/featurefile/Testrunner.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_username_in_username_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_password_in_password_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_login_Button_And_it_navigate_to_search_page()"
});
formatter.result({
  "status": "skipped"
});
});