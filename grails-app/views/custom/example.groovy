// Example of the  basic script requirements.
// In this example, the returned map contains the model (model:[origScript:"example.groovy"]) that is passed on to the view to be rendered, showView which signifies 
// there is a view associated with this script (example.gsp) and viewFile which is the name of the view to render sans the extension..
// The view requires origScript so it can display the information <div>The original script = ${origScript}</div>


return [model:[origScript:"example.groovy"], showView:true, viewFile:"example"]
