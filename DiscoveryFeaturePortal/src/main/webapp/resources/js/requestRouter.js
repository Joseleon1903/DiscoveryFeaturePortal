/**
 * 
 */

function setRequest(context , type, url , data){
	console.log("entrando en metodo setRequest");
	console.log("type: "+ type);
	console.log("url Base: "+ URL_BASE);
	console.log("url param: "+url);
	var response;
	context.$http.get(URL_BASE+url).then(response => {
         console.log('response: '+response.data);
         response = response.data;
     }, response => {
         console.log('response error : '+response.status);
     });
	return response;
}

/**
 * 
 * @param context
 * @param url
 * @returns {data}
 */
function setRequestGetBase(context,url){
	console.log("entrando en metodo setRequestGetBase");
	console.log("url param: "+url);
	var responseOut;
	context.$http.get(URL_BASE+url).then(response => {
         console.log('response: '+response.data);
         responseOut = response.data;
         context.totalPatallas = responseOut.contadorPantalla;
         context.totalFlujos = responseOut.contadorFlujo;
         console.log('response data: '+ responseOut);
     }, response => {
         console.log('response error : '+response.status);
     });
	return responseOut;
}