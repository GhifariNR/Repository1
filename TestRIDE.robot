*** Settings ***
Library           Selenium2Library

*** Variables ***
${Uname1}         id=text
${Pw1}            id=password
${logbtn}         id=login-button
${link1}          http://www.webdriveruniversity.com/Login-Portal/index.html
${link2}          https://www.w3schools.com/
${logbtn2}        id=w3loginbtn
${Uname2}         xpath=//*[@id="modalusername"]
${Pw2}            xpath=//*[@id="current-password"]
${Submit}         xpath=//*[@id="root"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button
${logout}         xpath=//*[@id="navigation"]/div/button

*** Test Cases ***
Coba1
    [Documentation]    Test ini digunakan untuk mencoba login ke webdriveruniversity.com dari page awal website.
    Open Browser    ${link1}    chrome
    Maximize Browser Window
    wait until page contains    WebDriver | Login Portal
    input_text    ${Uname1}    asbd123
    input_text    ${Pw1}    123213
    click_element    ${logbtn}
    Close Browser

Coba 2
    [Documentation]    Test ini digunakan untuk mencoba login dan logout ke w3school
    Open Browser    ${link2}    chrome
    Maximize Browser Window
    wait until page contains    W3Schools Online Web Tutorials
    click_element    ${logbtn2}
    wait until page contains element    //*[@id="modalusername"]
    input_text    ${Uname2}    gnaufalr@gmail.com
    wait until page contains element    //*[@id="current-password"]
    input_text    ${Pw2}    Gh123@gmail
    wait until page contains element    //*[@id="root"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button
    click_element    ${Submit}
    wait until page contains element    //*[@id="navigation"]/div/button
    click_element    ${logout}
    Close Browser
