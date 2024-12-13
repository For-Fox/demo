document.getElementById('imageForm').addEventListener('submit', function(event) {
   event.preventDefault();

const imageUrl = document.getElementById('imageUrl').value.trim();
   if (!imageUrl) {
       console.error("URL");
       return;
   }

   const imgElement = document.createElement('img');
   imgElement.src = imageUrl;
   imgElement.alt = 'IMG';

   document.querySelector('.imgs_container').appendChild(imgElement);
});
