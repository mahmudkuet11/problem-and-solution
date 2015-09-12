	public function uploadMap(){
		$file = Input::file('file');
		$destinationPath = 'uploads';
		// If the uploads fail due to file system, you can try doing public_path().'/uploads' 
		$filename = $file->getClientOriginalName();
		$extension =$file->getClientOriginalExtension(); 
		$upload_success = Input::file('file')->move($destinationPath, $filename);

		if( $upload_success ) {
		   return 'ok';
		} else {
		   return 'not';
		}
	}