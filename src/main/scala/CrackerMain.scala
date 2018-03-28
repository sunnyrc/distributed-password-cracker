object CrackerMain extends App{

  val INPUTN = 6

// FOR SERVER:
  //  MODE , RABBIT ADDRESS , REDIS ADDRESS

//  FOR CLIENT:
  // MODE ,  , SERVER ADDRESS , HASH

//  FOR WORKER:
  // MODE , SERVER ADDRESS , RABBIT ADDRESS , REDIS ADDRESS

  if (args.length == 0){
    println("Insufficient Input")
  }
  else{
    val mode = args(0)
    if (mode == "server"){
      if(args.length != 3){
        println("Insufficient Input")
      }
      else{
        HttpServer.main(args.tail)

      }

    }
    else if(mode == "client"){
      if(args.length != 3){
        println("Insufficient Input")
      }
      else {
        DispatcherMain.main(args.tail)

      }

    }
    else if(mode == "worker"){
      if(args.length != 4){
        println("Insufficient Input")
      }
      else {
        JobFetcher.main(args.tail)

      }

    }
    else{
      println("Invalid mode")
    }


  }

}
