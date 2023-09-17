# pricebot (VTHACKS Project)
A Slack reporter for stock price
## Inspiration
Just want to slack and get stock information during work.
## What it does
Basically, the project is the backend service integrated with Slack app to report the stock price in the channel. Users can simply type a command interacting with the customized Slack app to get the information. Moreover, the Slack app can also remind the users what is the closing price of companies daily!
## How we built it
We embrace **Java Spring Boot** as our backend framework, using **Slack Java SDK** to communicate with the Slack channel. Then we have a good time with **Docker** to containerize our backend service so that our Java backend can run in anywhere. Finally, we use **GitHub Actions** to build the docker image and deploy it on **Render** cloud server.
## Challenges we ran into
We are the first-timers in Hackathons and definitely encountered the problem in integration of different libraries. For example, the Slack app can only send the `x-www-urlencode` request format we did not know and this took us a lot of time to debug.
## Accomplishments that we're proud of and what we learned
We knew the entire software development workflow from **dev** to **deploy**. It's totally different experience from school.
## What's next for pricebot
We would like to distribute our Slack app.
