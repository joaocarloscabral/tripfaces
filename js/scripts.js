$(document).ready(function() {
  var trip = new Trip([
    {
      sel : $('.demo-index.step1'),
      position : 's',
      content : 'Hi, I am Trip.js',
      delay : 2000,
      callback : function(i) {
        console.log("step "+ i +" is finished");
      }
    },
    {
      sel : $('.demo-index.step2'),
      position : 'e',
      content : 'This is a plugin that can help you make hint flow easily !',
      delay : 3000,
      callback : function(i) {
        console.log("step "+ i +" is finished");
      }
    },
    {
      sel : $('.demo-index.step2'),
      position : 'n',
      content : 'Can be placed in many directions - North',
      delay : 2000
    },
    {
    	sel : $('.demo-index.step2'),
      position : 'e',
      content : 'East',
      delay : 2000
    },
    {
    	sel : $('.demo-index.step1'),
      position : 'w',
      content : 'West',
      delay : 2000
    },
    {
    	sel : $('.demo-index.step2'),
      position : 's',
      content : 'South',
      delay : 2000
    },
    {
      sel : $('.demo-index.step1'),
      content : 'Can control if the user can proceed',
      delay : 2000,
      canGoNext: function() {
        return confirm("You can only continue if you agree!");
      }
    },
    {
      sel : $('.demo-index.step2'),
      content : 'You can\'t proceed until you click next',
      delay : -1,
      showNavigation: true
    },
    {
      sel : $('.demo-index.step1'),
      content : 'The user can stop the tour by hitting Esc or clicking the Close box',
      delay : -1,
      showNavigation: true,
      showCloseBox: true
    },
    {
      sel : $('.demo-index.step8'),
      position : 'n',
      content : 'One more thing, plz read this !',
      expose : true,
      delay : 7000
    }
  ], {
    tripTheme : "dark",
    onStart : function() {
      console.log("onStart");
    },
    onEnd : function() {
      console.log("onEnd");
    },
    onTripStop : function() {
      console.log("onTripStop");
    },
    onTripChange : function(index, tripBlock) {
      console.log("onTripChange");
    },
    backToTopWhenEnded : true,
    delay : 2000
  });

  $(".start-demo-index").click(function() {
    trip.start();
  });

  window.trip = trip;
});
