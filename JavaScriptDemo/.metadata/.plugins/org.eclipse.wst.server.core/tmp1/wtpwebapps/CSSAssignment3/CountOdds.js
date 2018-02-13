
self.onmessage = function(e) {
	  console.log('Message received from main script');
	  
	  for(var i=1;i<=e.data.limit;i++)
		{
		if((i%2)!=0)
			postMessage(i);			 
		}
	}


