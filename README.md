# Play framework XSS vulnerable application

[Click to see how to install and setup play framework](https://playframework.com/documentation/2.5.x/Installing)

This is a simple web application with eight basic test cases for testing XSS injection vulnerabilities.

##Current vulnerabilities in the app:

1. TestCase 1: User input is directly and without any encoding used in response. This is the most trivial reflected xss.
To exploit: `/ui=<script>alert()</script>`

2. TestCase 2: User input is used in double quote html id property of tag. Breaking out of tag is easy: `ui="><script>alert()</script>`

3. TestCase 3: User input is used directly in JS code. Exploit : ui="%3balert()//
 
4. TestCase 4: User input is used in id property of <p> tag with single quotes. To exploit: ui='><script>alert()</script>

5. TestCase 5: User input is used in property with no quotes. To exploit: ui=asdf onclick=alert()
 
6. fragmentTest: User input is used to select image via Javascript from fragment part of the URL. To exploit: #'onclick=alert() a.

**Note:** This exploit will only work on Chrome.

7. imageOnLoad: To exploit : ui=javascript:alert()

8. Link href exploit: ui=javascript:alert()

##Enable/disable Play's default encoding
TestCase1~5 use @html() which is Play's raw html function. To enable encoding and see how Play framework protects against the attacks, just
replace the @Html(foo) with @foo in these test cases.
