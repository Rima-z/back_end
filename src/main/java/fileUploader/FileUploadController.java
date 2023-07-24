package fileUploader;

import java.io.File;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/file")
public class FileUploadController {
		
	 @PostMapping("/upload")
	    public String uploadFile(HttpServletRequest request, @RequestParam("file") MultipartFile multipartFile) {
	        if (!multipartFile.isEmpty()) {
	            try {
	                String uploadPath = "D:\\filesUploaded/"; // Définissez le chemin vers le répertoire d'upload
	                File uploadDir = new File(uploadPath);
	                if (!uploadDir.exists()) {
	                    uploadDir.mkdirs();
	                }
	                
	                String originalFileName = multipartFile.getOriginalFilename();
	                String filePath = uploadPath + File.separator + originalFileName;
	                File dest = new File(filePath);
	                multipartFile.transferTo(dest);

	                return "redirect:/success"; // Redirigez vers une page de succès après l'upload réussi
	            } catch (Exception e) {
	                e.printStackTrace();
	                return "redirect:/error"; // Redirigez vers une page d'erreur en cas d'échec de l'upload
	            }
	        }
	        
	        return "redirect:/error"; // Redirigez vers une page d'erreur si aucune pièce jointe n'a été fournie
	    }
}
