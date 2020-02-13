/* file(image) -> base64 String 인코딩 */
// input : file object
// output : String
function encodeBase64File(file) {
    return new Promise((resolve, reject) => {
        const reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = () => resolve(reader.result);
        reader.onerror = error => reject(error);
    });
}