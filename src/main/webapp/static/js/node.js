/*
��body��һ��id�ţ���ȡ�ڵ����÷����ڼ����¼���ִ�п�һ���Խ��ҳ�������пսڵ�ĸ��š�
���ֻ��ȥ��ĳ���ڵ��������ӽڵ��еĿհ׽ڵ㣬��ֻ�贫���Ӧ�Ľڵ�
*/
function clearWhitespace(clean_node){
	var node_arr=clean_node.childNodes;
	for(var i=0;i<node_arr.length;i++){
			if(typeof(node_arr[i].innerHTML)=="undefined" && !/\S/.test(node_arr[i].nodeValue)){
				node_arr[i].parentNode.removeChild(node_arr[i]);
				i--;
			}else{
				var child_node_arr=node_arr[i].childNodes;
				if(child_node_arr.length==0){
					continue;
				}else{
					clearWhitespace(node_arr[i]);	
				}
			}
		}
}
    