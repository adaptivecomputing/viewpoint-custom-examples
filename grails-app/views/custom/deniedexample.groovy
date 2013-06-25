// Example: Making the denied page come up if the user doesn't have permission.
// Note: see example.gsp and example.groovy to see how the model map is used (model:[:])
// This example also uses aceMessage, aceError and aceDetails. 
// If aceMessage is specified the green success box will be displayed after the page has loaded.
// if aceInfo is specified the information box will be shown.
// If aceError is specified the error box will display and if aceDetails is specified the box will have the details link.
// aceWarning works the same as aceError but displays the warning box.


// Here the permission is checked. In this example the permission doesn't exist by default, so all users will get denied except moab-admin.
if( user.hasPermission("custom.example.read") ) { 
  return [model:[origScript:"deniedexample.groovy"], aceMessage:"The user has 'custom.example.read' permission" , showView:true, viewFile:"example"]
} else if(user.root) { // check to see if it's moab-admin
   // moab-admin so return the info and render the view. Include a model map so the view has data.
   return [model:[origScript:"deniedexample.groovy"], aceMessage:"The user is root so they have total control" , showView:true, viewFile:"example"]
} else {
   // Go to the denied page.
   return [denied:true, aceError:"The user has no permissions", aceDetails:"The user needs 'custom.example.read' permission"]
}
