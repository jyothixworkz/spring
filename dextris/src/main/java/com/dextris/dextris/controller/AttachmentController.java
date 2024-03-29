package com.dextris.dextris.controller;

import com.dextris.dextris.entity.Attachment;
import com.dextris.dextris.model.ResponseData;
import com.dextris.dextris.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AttachmentController {
    @Autowired
    private AttachmentService attachmentService;



    @PostMapping("/upload")
    public ResponseData uploadFile(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        Attachment attachment = null;
        String downloadURL="";
       attachment= attachmentService.saveAttachment(multipartFile);
       downloadURL= ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").path(attachment.getId()).toUriString();

return  new ResponseData(attachment.getFileName(),downloadURL,multipartFile.getContentType(),multipartFile. getSize());
    }
    @GetMapping("/download/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) throws Exception {

Attachment attachment= null;
attachment=attachmentService.getAttachment(fileId);
return ResponseEntity.ok().contentType(MediaType.parseMediaType(attachment.getFileType()))
        .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename=\""+attachment.getFileName()+"\"")
        .body(new ByteArrayResource(attachment.getData()));
    }
}
