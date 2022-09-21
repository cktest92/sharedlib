def list(){
            dir("C:\\Windows\\System32\\"){
           try {      
             
             bat("sc queryex type=service state=all")

            } catch (err) {
                echo "already listed"
            }
                }
            }
}
