$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Discovery.feature");
formatter.feature({
  "line": 1,
  "name": "Discovery Add videos to favourite functionality",
  "description": "",
  "id": "discovery-add-videos-to-favourite-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1810561526,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Adding 2 videos to favourite in discovery",
  "description": "",
  "id": "discovery-add-videos-to-favourite-functionality;adding-2-videos-to-favourite-in-discovery",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a user goes to discovery homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a user adds videos to favourite",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the videos should be visible in my videos section",
  "keyword": "Then "
});
formatter.match({
  "location": "DiscoveryStep.openUrl()"
});
formatter.result({
  "duration": 5947076648,
  "status": "passed"
});
formatter.match({
  "location": "DiscoveryStep.addToFav()"
});
formatter.result({
  "duration": 485429081,
  "status": "passed"
});
formatter.match({
  "location": "DiscoveryStep.checkInMyVideos()"
});
formatter.result({
  "duration": 3259327951,
  "status": "passed"
});
formatter.after({
  "duration": 150639258,
  "status": "passed"
});
});