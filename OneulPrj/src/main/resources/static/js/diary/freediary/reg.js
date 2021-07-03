window.addEventListener("load", function() {
	
	
	let quetionList = document.querySelector('.quetionList');
	let textareaContent = document.querySelector(".content");
	let selectedQuestion = document.querySelector(".selectedQuestion");
	console.log(textareaContent);
	
	quetionList.oninput = function(e){
		console.log('질문선택했음');
	let text = quetionList.text;
	let value = quetionList.value;
	
	console.log(text);
	console.log(value);

		selectedQuestion.value=value;
	};


});
 window.addEventListener("load",()=>{
	const fileInput = document.querySelector("input[type='file']");
	
	fileInput.oninput = ()=>{
		let file = fileInput.files[0];
		if(file.type.indexOf("image/") < 0)
			alert("이미지 형식만 사용할 수 있습니다.");
			
		let reader = new FileReader();
		
		reader.readAsDataURL(file);
		reader.onload = (e)=>{
			console.log("reader load");
			let img = document.querySelector(".image");
			img.src = e.target.result;
			img.style.width = "200px";
			img.style.height = "150px";
			
			fileInput.insertAdjacentElement("beforebegin",img);
		};
		
			
	}
});