document.addEventListener("DOMContentLoaded", function () {
  // Load header
  const header = document.getElementById("header-placeholder");
  if (header) {
    fetch("header.html")
      .then((res) => res.text())
      .then((data) => {
        header.innerHTML = data;
      })
      .catch((err) => console.error("Lỗi khi load header:", err));
  }

  // Load footer
  const footer = document.getElementById("footer-placeholder");
  if (footer) {
    fetch("footer.html")
      .then((res) => res.text())
      .then((data) => {
        footer.innerHTML = data;
      })
      .catch((err) => console.error("Lỗi khi load footer:", err));
  }

  // Load banner
  const banner = document.getElementById("banner-placeholder");
  if (banner) {
    fetch("banner.html")
      .then((res) => res.text())
      .then((data) => {
        banner.innerHTML = data;
      })
      .catch((err) => console.error("Lỗi khi load banner:", err));
  }
  //index
  const indexBanner = document.getElementById("index-placeholder");
    if (indexBanner) {
        fetch("index.html")
        .then((res) => res.text())
        .then((data) => {
            indexBanner.innerHTML = data;
        })
        .catch((err) => console.error("Lỗi khi load index banner:", err));
    }  
});
