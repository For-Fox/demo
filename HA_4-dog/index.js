const imgElement = document.getElementById('Dog');

async function fetchDog() {
  try {
    const response = await fetch('https://dog.ceo/api/breeds/image/random');
    const data = await response.json();

    const DogUrl = data.message;

    imgElement.src = DogUrl;
  } catch (error) {
    console.error('Ошибка при загрузке изображения:', error);
  }
}

fetchDog();