async function makeRequest (movieName){
    formData = new FormData();
    formData.append("movie-name",movieName);
    let data = await(fetch('http://localhost:8080/movies/?movie-name='+movieName, {
        method: 'GET',
    }));
    console.log(JSON.parse(data));
    data = JSON.parse(data);
    document.getElementById("movie-data").innerHTML = data;
}