var { requireNativeComponent, PropTypes } = require('react-native');

var iface = {
  name: 'Button',
  propTypes: {
    width: PropTypes.number
  }
};

var FBButton = requireNativeComponent('MyButton', iface);
console.log("here here");
console.log(FBButton);
module.exports = FBButton;
